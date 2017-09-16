/**   
* @Title: Run.java 
* @Package cn.songzx.lock.condition.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:48:00 
* @version V1.0   
*/
package cn.songzx.lock.condition.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: Run
 * @Description: TODO(Condition对象可以对线程执行的业务进行排序规划)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:48:00
 * 
 */
public class Run {
	volatile private static int nextPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conditionA = lock.newCondition();
	final private static Condition conditionB = lock.newCondition();
	final private static Condition conditionC = lock.newCondition();

	public static void main(String[] args) {
		Thread threadA = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 1) {
						conditionA.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadA " + (i + 1));
					}
					nextPrintWho = 2;
					conditionB.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread threadB = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 2) {
						conditionB.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadB " + (i + 1));
					}
					nextPrintWho = 3;
					conditionC.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread threadC = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (nextPrintWho != 3) {
						conditionC.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadC " + (i + 1));
					}
					nextPrintWho = 1;
					conditionA.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		for (int i = 0; i < cArray.length; i++) {
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
	}
}

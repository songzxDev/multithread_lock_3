/**   
* @Title: MyServiceC.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����9:31:13 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyServiceC
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����9:31:13
 * 
 */
public class MyServiceC {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("wait begin timer=" + System.currentTimeMillis());
			condition.awaitUntil(calendarRef.getTime());
			System.out.println("wait   end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notifyMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("notify begin timer=" + System.currentTimeMillis());
			condition.signalAll();
			System.out.println("notify   end timer=" + System.currentTimeMillis());
		} finally {
			lock.unlock();
		}
	}
}

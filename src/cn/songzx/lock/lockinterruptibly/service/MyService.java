/**   
* @Title: MySerivce.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����7:49:57 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySerivce
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����7:49:57
 * 
 */
public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			/*
			 * ����lockInterruptibly()�������ǣ������ǰ�߳�δ���жϣ����ȡ����������Ѿ����ж����ܳ��쳣
			 */
			lock.lockInterruptibly();
			System.out.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < (Integer.MAX_VALUE / 10); i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println("lock   end " + Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}

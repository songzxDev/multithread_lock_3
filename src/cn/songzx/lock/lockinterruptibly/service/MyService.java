/**   
* @Title: MySerivce.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午7:49:57 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySerivce
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午7:49:57
 * 
 */
public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			/*
			 * 方法lockInterruptibly()的作用是：如果当前线程未被中断，则获取锁定，如果已经被中断则跑出异常
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

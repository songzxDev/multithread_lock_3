/**   
* @Title: MySerivceA.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午8:06:30 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySerivceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午8:06:30
 * 
 */
public class MyServiceA {
	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		/*
		 * tryLock()的作用是，仅在调用时锁定未被另一个线程保持锁定的情况下，才获取该锁定
		 */
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "获得锁！");
		} else {
			System.out.println(Thread.currentThread().getName() + "没有获得锁！");
		}
	}

	public void waitMethodParam() {
		try {
			/*
			 * tryLock(long timeout,TimeUnitunit)的作用是
			 * 
			 * 如果锁定在给定等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁定
			 */
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println("★★★★★★★★★★" + Thread.currentThread().getName() + "获得锁的时间为：" + System.currentTimeMillis());
				Thread.sleep(10000L);
			} else {
				System.out.println("☆☆☆☆☆☆☆☆☆☆" + Thread.currentThread().getName() + "没有获得锁！");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}

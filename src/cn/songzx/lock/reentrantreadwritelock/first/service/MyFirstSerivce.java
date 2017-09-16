/**   
* @Title: MyFirstSerivce.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午10:08:08 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName: MyFirstSerivce
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午10:08:08
 * 
 */
public class MyFirstSerivce {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			try {
				lock.readLock().lock();
				System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000L);
			} finally {
				lock.readLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void write() {
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000L);
			} finally {
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

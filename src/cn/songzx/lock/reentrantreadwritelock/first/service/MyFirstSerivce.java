/**   
* @Title: MyFirstSerivce.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����10:08:08 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName: MyFirstSerivce
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����10:08:08
 * 
 */
public class MyFirstSerivce {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void read() {
		try {
			try {
				lock.readLock().lock();
				System.out.println("��ö���" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
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
				System.out.println("���д��" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000L);
			} finally {
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

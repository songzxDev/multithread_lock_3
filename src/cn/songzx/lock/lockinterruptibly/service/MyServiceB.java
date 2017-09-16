/**   
* @Title: MyServiceB.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:04:05 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyServiceB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:04:05
 * 
 */
public class MyServiceB {
	private ReentrantLock lock = new ReentrantLock();

	private Condition condition = lock.newCondition();

	public void testMethod() {
		try {
			lock.lock();
			System.out.println("wait begin");
			// condition.await();
			/*
			 * 
			 */
			condition.awaitUninterruptibly();
			System.out.println("wait   end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}

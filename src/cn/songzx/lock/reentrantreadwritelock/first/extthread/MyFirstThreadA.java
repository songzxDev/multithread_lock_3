/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.lock.reentrantreadwritelock.first.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午10:11:39 
* @version V1.0   
*/
package cn.songzx.lock.reentrantreadwritelock.first.extthread;

import cn.songzx.lock.reentrantreadwritelock.first.service.MyFirstSerivce;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午10:11:39
 * 
 */
public class MyFirstThreadA extends Thread {
	private MyFirstSerivce service;

	/**
	 * @Date: 2017年9月16日下午10:12:16
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyFirstThreadA(MyFirstSerivce service) {
		super();
		this.service = service;
	}

	public void run() {
		service.read();
		service.write();
	}
}

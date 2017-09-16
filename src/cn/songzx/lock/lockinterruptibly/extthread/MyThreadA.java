/**   
* @Title: MyThreadA.java 
* @Package cn.songzx.lock.lockinterruptibly.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:06:30 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.extthread;

import cn.songzx.lock.lockinterruptibly.service.MyServiceB;

/**
 * @ClassName: MyThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:06:30
 * 
 */
public class MyThreadA extends Thread {

	private MyServiceB service;

	/**
	 * @Date: 2017年9月16日下午9:07:27
	 * @Title: MyThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyThreadA(MyServiceB service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}

/**   
* @Title: MyThreadD.java 
* @Package cn.songzx.lock.lockinterruptibly.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:40:38 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.extthread;

import cn.songzx.lock.lockinterruptibly.service.MyServiceC;

/**
 * @ClassName: MyThreadD
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:40:38
 * 
 */
public class MyThreadD extends Thread {
	private MyServiceC service;

	/**
	 * @Date: 2017年9月16日下午9:41:19
	 * @Title: MyThreadD.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyThreadD(MyServiceC service) {
		super();
		this.service = service;
	}

	public void run() {
		service.notifyMethod();
	}

}

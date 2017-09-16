/**   
* @Title: MyRunB.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:07:59 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.extthread.MyThreadA;
import cn.songzx.lock.lockinterruptibly.service.MyServiceB;

/**
 * @ClassName: MyRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:07:59
 * 
 */
public class MyRunB {

	/**
	 * @Date: 2017年9月16日下午9:07:59
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyServiceB service = new MyServiceB();

			MyThreadA threadA = new MyThreadA(service);
			threadA.start();
			Thread.sleep(3000L);
			threadA.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

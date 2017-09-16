/**   
* @Title: MyRunC.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午9:37:45 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.extthread.MyThreadC;
import cn.songzx.lock.lockinterruptibly.extthread.MyThreadD;
import cn.songzx.lock.lockinterruptibly.service.MyServiceC;

/**
 * @ClassName: MyRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午9:37:45
 * 
 */
public class MyRunC {
	public static void main(String[] args) {
		try {
			MyServiceC service = new MyServiceC();
			MyThreadC cThread = new MyThreadC(service);
			cThread.start();
			Thread.sleep(2000L);
			MyThreadD dThread = new MyThreadD(service);
			dThread.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

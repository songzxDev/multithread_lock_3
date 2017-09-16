/**   
* @Title: MyRun.java 
* @Package cn.songzx.lock.lockinterruptibly.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年9月16日 下午7:54:15 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.test;

import cn.songzx.lock.lockinterruptibly.service.MyService;

/**
 * @ClassName: MyRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年9月16日 下午7:54:15
 * 
 */
public class MyRun {

	/**
	 * @Date: 2017年9月16日下午7:54:15
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) throws Exception {
		final MyService serivce = new MyService();
		Runnable runnableRef = new Runnable() {
			public void run() {
				serivce.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("ThreadA");
		threadA.start();
		Thread.sleep(5000L);
		Thread threadB = new Thread(runnableRef);
		threadB.setName("ThreadB");
		threadB.start();
		threadB.interrupt();// 打标记
		System.out.println("main end！");
	}

}

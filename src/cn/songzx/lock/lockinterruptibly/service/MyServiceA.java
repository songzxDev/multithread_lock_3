/**   
* @Title: MySerivceA.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����8:06:30 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MySerivceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��9��16�� ����8:06:30
 * 
 */
public class MyServiceA {
	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		/*
		 * tryLock()�������ǣ����ڵ���ʱ����δ����һ���̱߳�������������£��Ż�ȡ������
		 */
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "�������");
		} else {
			System.out.println(Thread.currentThread().getName() + "û�л������");
		}
	}
}

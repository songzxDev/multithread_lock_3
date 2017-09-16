/**   
* @Title: MySerivceA.java 
* @Package cn.songzx.lock.lockinterruptibly.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��9��16�� ����8:06:30 
* @version V1.0   
*/
package cn.songzx.lock.lockinterruptibly.service;

import java.util.concurrent.TimeUnit;
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

	public void waitMethodParam() {
		try {
			/*
			 * tryLock(long timeout,TimeUnitunit)��������
			 * 
			 * ��������ڸ����ȴ�ʱ����û�б���һ���̱߳��֣��ҵ�ǰ�߳�δ���жϣ����ȡ������
			 */
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println("�����������" + Thread.currentThread().getName() + "�������ʱ��Ϊ��" + System.currentTimeMillis());
				Thread.sleep(10000L);
			} else {
				System.out.println("�����������" + Thread.currentThread().getName() + "û�л������");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}

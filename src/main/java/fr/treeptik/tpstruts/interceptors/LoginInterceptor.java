package fr.treeptik.tpstruts.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvok) throws Exception {
		Map<String, Object> session = actionInvok.getInvocationContext()
				.getSession();
		if (session.get("USER") == null) {
			return Action.LOGIN;
		}
		return actionInvok.invoke();
	}

}

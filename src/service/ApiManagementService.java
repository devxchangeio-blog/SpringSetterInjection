/**
 * 
 */
package service;

import manager.ApiManager;

/**
 * @author Karthy
 * 
 */
public class ApiManagementService {

	public ApiManager apiManager;

	public void setApiManager(ApiManager manager) {

		this.apiManager = manager;

	}

	public void askQuestion() {

		System.out.println(apiManager.popQuestion());
	}
}

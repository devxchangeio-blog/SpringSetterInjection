/**
 * 
 */
package manager;

import model.ApiModel;

/**
 * @author Karthy
 * 
 */
public class MasheryManagerImpl implements ApiManager {
	
	public ApiModel apiModel;

	public void setApiModel(ApiModel apiModel) {

		this.apiModel = apiModel;

	}

	public String popQuestion() {

		return apiModel.getQuestion();
	}

}

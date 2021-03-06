
package telran.ashkelon2018.mishpahug.domain;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = {"login"})
@Document(collection = "Mishpahug_users")
@Builder
public class UserAccount  {
	@Id
	String login;
	String password;
	String firstName;
	String lastName;
	String dateOfBirth;
	String gender;
	String maritalStatus;
	String confession;
	String[] pictureLink;// avatar and banner
	String phoneNumber;
	String[] foodPreferences;
	String[] languages;
	String description;
	@Builder.Default
	Double rate=0.0;
	@Builder.Default
	Integer numberOfVoters=0;
	Set<String> roles;

	
	public void addRate() {
		rate++;
	}
}
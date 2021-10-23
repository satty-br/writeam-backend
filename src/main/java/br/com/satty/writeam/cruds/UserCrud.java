package br.com.satty.writeam.cruds;

import br.com.satty.writeam.modals.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserCrud  extends PagingAndSortingRepository<User, Long> {


}

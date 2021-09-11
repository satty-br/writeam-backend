package br.com.satty.writeam.cruds;

import br.com.satty.writeam.modals.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioCrud  extends PagingAndSortingRepository<Usuario, Long> {


}

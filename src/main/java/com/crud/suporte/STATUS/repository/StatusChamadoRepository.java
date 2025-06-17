
package com.crud.suporte.STATUS.repository;


import com.crud.suporte.STATUS.model.StatusChamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatusChamadoRepository extends JpaRepository<StatusChamado, Long> {
}


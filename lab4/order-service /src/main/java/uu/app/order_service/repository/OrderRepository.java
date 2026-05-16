package uu.app.order_service.repository;

import uu.app.order_service.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
// -- Вказує, що репозиторій працює з об'єктами типу OrderEntity. // -- Long — тип первинного ключа (id) у OrderEntity.
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
package vut.fit.iss.repository.user.stuff;

import org.springframework.data.jpa.repository.JpaRepository;
import vut.fit.iss.domain.user.staff.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}


package id.ac.polban.pbo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SavingsAccountTest {

    @Test
    void withdraw_tepatBatasMinimum_diterima()
            throws InsufficientBalanceException {

        SavingsAccount savings = new SavingsAccount(
            "003", "Citra", 100_000, 0.05);

        savings.withdraw(50_000);

        assertEquals(
            SavingsAccount.MIN_BALANCE,
            savings.getBalance(),
            0.001
        );
    }

    @Test
    void constructor_bungaNegatif_ditolak() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new SavingsAccount(
                "003", "Citra", 100_000, -0.05
            )
        );

        assertEquals(
            "Bunga tidak boleh negatif",
            ex.getMessage()
        );
    }
}

package bspo.SoftwareDesing.Exercise3;

/**
 * Interface IRunner
 *
 * This interface defines methods for a program runner.
 * It includes operations related to the execution flow and user interaction.
 */
public interface IRunner {

    /**
     * Executes the main functionality of the program.
     */
    void run();

    /**
     * Displays the program menu, providing options for user interaction.
     */
    void menu();

    /**
     * Sets the selected option for further processing.
     * @param option The selected option by the user.
     */
    void setOption(String option);
}


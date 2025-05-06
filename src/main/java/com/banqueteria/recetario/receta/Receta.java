@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(length = 1000)
    private String description;
    @Column(length = 1000)
    private String ingredients;
    @Column(length = 1000)
    private String steps;

    // Getters & setters
}
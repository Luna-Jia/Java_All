package zoo;

public class Zoo {

    int actual_num_animals;
    int num_cages;
    Animal[] animals;

    public Zoo() {
        this.num_cages = 3;
        animals = new Animal[num_cages];
    }

    public Zoo(int num_cages) {
        this.num_cages = num_cages;
        animals = new Animal[num_cages];
    }

    public void add(Animal animal) {
        if (num_cages == actual_num_animals){
            System.out.println("Zoo is full. Cannot add.");
            return;
        } else {
            animals[actual_num_animals++] = animal;
        }
    }

    public double total_weight(){
        double total_weight = 0;
        for (int i=0; i<actual_num_animals; i++){
            total_weight += animals[i].getWeight();
        }
        return total_weight;
    }

    public void  make_all_noises(){
        for (int i=0; i<actual_num_animals; i++){
            System.out.println(animals[i].makeNoise());
        }
    }

    public void print_all_animals(){
        for (int i=0; i<actual_num_animals; i++){
            System.out.println(animals[i]);
        }
    }
}

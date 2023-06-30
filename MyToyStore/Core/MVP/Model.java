package MyToyStore.Core.MVP;

import MyToyStore.Core.Infrastructure.ToyBox;

public class Model {
    ToyBox currenToyBox;

    public Model() {
        currenToyBox = new ToyBox();
    }
}

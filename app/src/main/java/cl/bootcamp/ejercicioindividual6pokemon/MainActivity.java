package cl.bootcamp.ejercicioindividual6pokemon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private RadioGroup pokemonGroup;
    private Button validateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pokemonGroup = findViewById(R.id.pokemon_group);
        validateButton = findViewById(R.id.validate_button);

        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectId = pokemonGroup.getCheckedRadioButtonId();
                if (selectId == -1) {
                    Toast.makeText(MainActivity.this, "Selecciona un Pokemon", Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton selectedPokemon = findViewById(selectId);
                    String message = "Has seleccionado a " + selectedPokemon.getText();
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
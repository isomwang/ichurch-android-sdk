package ichurch.android.sdk

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.google.android.material.button.MaterialButton

class iChurchSigninButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.ichurch_signin_button, this, true)
        val button = findViewById<MaterialButton>(R.id.signin_button)
        button.setOnClickListener {
            // Handle sign-in logic here
        }
    }
}
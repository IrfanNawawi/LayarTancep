package id.heycoding.shared.utils.ext

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText


/**
 * Created by Irfan Nawawi on 26/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
fun EditText.listen(
    beforeTextChanged: ((String) -> Unit)? = null,
    onTextChanged: ((String) -> Unit)? = null,
    afterTextChanged: ((String) -> Unit)? = null
) {
    this.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            beforeTextChanged?.invoke(p0.toString())
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            onTextChanged?.invoke(p0.toString())
        }

        override fun afterTextChanged(p0: Editable?) {
            afterTextChanged?.invoke(p0.toString())
        }

    })
}
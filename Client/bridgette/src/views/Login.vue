<template>
  <v-container>
    <v-row id="title_row" align="strech" justify="space-around">
      <p class="display-3"> 
        הרשמה
      </p>
    </v-row>
    
    <v-row align="strech" justify="space-around">
      <v-col cols="4">
        <v-form ref="form" v-model="valid" :lazy-validation="lazy">
          <v-text-field
            v-model="name"
            counter
            :rules="nameRules"
            label="שם משתמש"
            rounded
            height="30"
            outlined
            required
            clearable
          ></v-text-field>

          <v-text-field
            v-model="password"
            :append-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
            :rules="[passwordRules.required, passwordRules.min]"
            :type="showPassword ? 'text' : 'password'"
            name="input-10-1"
            label="סיסמה"
            rounded
            outlined
            height="30"
            counter
            @click:append="showPassword = !showPassword"
          ></v-text-field>

          <v-btn color="error" class="mr-4" large @click="reset">אפס</v-btn>

          <v-btn :disabled="!valid" color="success" class="mr-4" large @click="validate">הירשם</v-btn>

          <!-- <v-btn color="warning" @click="resetValidation">Reset Validation</v-btn> -->
        </v-form>
      </v-col>

    </v-row>
  </v-container>
</template>

<script>
export default {
  data: () => ({
    valid: true,
    name: "",
    nameRules: [
      v => !!v || "אנא הכנס שם משתמש",
      // v => (v && v.length <= 10) || "Name must be less than 10 characters"
    ],
    password: "",
    passwordRules: {
      required: value => !!value || "אנא הכנס סיסמה",
      // min: v => v.length >= 8 || "על הס"
    },
    showPassword: false,
    lazy: false
  }),

  methods: {
    validate() {
      this.$refs.form.validate();
      this.$swal({
        icon: "error",
        title: "שם משתמש או סיסמה שגויים",
        confirmButtonText: "סגור",
      })
      this.reset()
      // this.$router.push("/videos")
      // this.$router.go()
    },
    reset() {
      this.$refs.form.reset();
    },
    resetValidation() {
      this.$refs.form.resetValidation();
    }
  }
};
</script>

<style>
#title_row {
  padding-top: 15vh;
  padding-bottom: 5vh;
}
</style>
import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';
import VueYouTubeEmbed from 'vue-youtube-embed'
import VueSweetalert2 from 'vue-sweetalert2'

Vue.config.productionTip = false
Vue.use(VueYouTubeEmbed)
Vue.use(VueSweetalert2)

new Vue({
  router,
  store,
  vuetify,
  VueYouTubeEmbed,
  VueSweetalert2,
  render: h => h(App)
}).$mount('#app')

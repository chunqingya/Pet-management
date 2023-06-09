import {createRouter,createWebHashHistory} from "vue-router";
import useLogin from "../stores/LoginStore"
import NProgress from 'nprogress'


const routes = [
    {
        path: '/login',
        name: 'login',
        component: () => import('../views/login/Index.vue'),
        meta: {
            // 标记该路由不需要登录
            noLogin: true
        }
    },
    {
        path: '/',
        name: 'home',
        component: () => import('../views/Index.vue'),
    }
]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

// 导航守卫
router.beforeEach((to, from) => {
    // 如果是目标路由不需要登录,则直接跳转
    NProgress.start()
    if(to.meta.noLogin){
        return true;
    }
    const loginInfo  = useLogin();
    if(loginInfo.isLogin()){
        return true;
    }else{
        // 如果没有登录,则跳转到登录页面
        return {name: "login"};
    }
})
router.afterEach((to, from) => {
    NProgress.done()
})

export default router

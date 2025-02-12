
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import 예약정보조회View from "./components/예약정보조회View"
import 예약정보조회ViewDetail from "./components/예약정보조회ViewDetail"
import 객실조회View from "./components/객실조회View"
import 객실조회ViewDetail from "./components/객실조회ViewDetail"
import 마이페이지View from "./components/마이페이지View"
import 마이페이지ViewDetail from "./components/마이페이지ViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/예약팀/예약정보조회',
                name: '예약정보조회View',
                component: 예약정보조회View
            },
            {
                path: '/예약팀/예약정보조회/:id',
                name: '예약정보조회ViewDetail',
                component: 예약정보조회ViewDetail
            },
            {
                path: '/예약팀/객실조회',
                name: '객실조회View',
                component: 객실조회View
            },
            {
                path: '/예약팀/객실조회/:id',
                name: '객실조회ViewDetail',
                component: 객실조회ViewDetail
            },
            {
                path: '/예약팀/마이페이지',
                name: '마이페이지View',
                component: 마이페이지View
            },
            {
                path: '/예약팀/마이페이지/:id',
                name: '마이페이지ViewDetail',
                component: 마이페이지ViewDetail
            },



    ]
})

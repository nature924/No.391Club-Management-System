import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import huodong from '@/views/modules/huodong/list'
    import huodongShenhe from '@/views/modules/huodongShenhe/list'
    import news from '@/views/modules/news/list'
    import shetuan from '@/views/modules/shetuan/list'
    import shetuanShenhe from '@/views/modules/shetuanShenhe/list'
    import tuanzhang from '@/views/modules/tuanzhang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryHuodong from '@/views/modules/dictionaryHuodong/list'
    import dictionaryHuodongShenheYesno from '@/views/modules/dictionaryHuodongShenheYesno/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShetuan from '@/views/modules/dictionaryShetuan/list'
    import dictionaryShetuanShenheYesno from '@/views/modules/dictionaryShetuanShenheYesno/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryHuodong',
        name: '活动类型',
        component: dictionaryHuodong
    }
    ,{
        path: '/dictionaryHuodongShenheYesno',
        name: '审核状态',
        component: dictionaryHuodongShenheYesno
    }
    ,{
        path: '/dictionaryNews',
        name: '公告信息类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShetuan',
        name: '社团类型',
        component: dictionaryShetuan
    }
    ,{
        path: '/dictionaryShetuanShenheYesno',
        name: '审核状态',
        component: dictionaryShetuanShenheYesno
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/huodong',
        name: '活动信息',
        component: huodong
      }
    ,{
        path: '/huodongShenhe',
        name: '活动审核',
        component: huodongShenhe
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/shetuan',
        name: '社团信息',
        component: shetuan
      }
    ,{
        path: '/shetuanShenhe',
        name: '社团审核',
        component: shetuanShenhe
      }
    ,{
        path: '/tuanzhang',
        name: '团长',
        component: tuanzhang
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

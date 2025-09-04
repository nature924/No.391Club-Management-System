const base = {
    get() {
        return {
            url : "http://localhost:8080/shetuanguanlixitong/",
            name: "shetuanguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shetuanguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社团管理系统"
        } 
    }
}
export default base

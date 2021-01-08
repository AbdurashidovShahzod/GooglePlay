package uz.unzosoft.googleplay.models

class GroupData {
    var title: String? = null
    var list: List<ChildData>? = null

    constructor(title: String?, list: List<ChildData>?) {
        this.title = title
        this.list = list
    }
}

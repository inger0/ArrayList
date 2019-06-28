class ArrayList implements List {
    // 保存元素的空间
    private Object[] array = new Object[5];
    // 有效元素的个数
    private int size = 0;

    // 实现接口中所有的方法
    @Override
    public int indexOf(Object o) {
        // 从0~size-1依次比较，如果相同则返回下标
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(o)) {
                return i;
            }
        }
        // 所有都不相同则返回-1
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        // 从后往前找
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object o) {
        // 如果有相同的元素，则indexOf(o)一定>=0
        return this.indexOf(o) >= 0;
    }

    @Override
    public void add(int index, Object o) {
        // 判断index是否合法
        if (index < 0 || index > this.size) {
            return;
        } else {
            // 判断数组是否已满
            // 如果数组长度length和有效元素个数size相同，表示数组已满
            if (this.array.length == this.size) {
                this.expand(3);
            }
            // 把index之后的元素从后往前依次向后移动
            // size-1 ~ index
            for (int i = this.size - 1; i >= index; i--) {
                this.array[i + 1] = this.array[i];
            }
            // 加入新元素
            this.array[index] = o;
            this.size++;
        }
    }

    // 把数组扩充n
    private void expand(int n) {
        if (n > 0) {
            // 创建新的数组，长度为原数组长度+n
            Object[] newArray = new Object[this.array.length + n];
            // 把原数组中所有数据放入新数组
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            // 使用新数组替换原数组
            this.array = newArray;
        }
    }

    @Override
    public void add(Object o) {
        // 追加元素就是在下标为size的位置增加元素
        this.add(this.size, o);
    }

    @Override
    public boolean remove(Object o) {
        // 查找o第一次出现的下标
        int index = this.indexOf(o);
        // 如果包含o，则index>=0，可以删除index位置的元素
        if (index >= 0) {
            this.remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object remove(int index) {
        // 判断index的合法性
        if (index < 0 || index >= this.size) {
            return null;
        } else {
            // 保存待删除元素
            Object o = this.array[index];
            // 从index+1到size-1所有元素从前往后依次前移
            for (int i = index + 1; i < this.size; i++) {
                this.array[i - 1] = this.array[i];
            }
            this.size--;
            return o;
        }
    }

    @Override
    public void clear() {
        // 就是把有效元素个数置为0
        this.size = 0;
    }

    @Override
    public Object set(int index, Object o) {
        if (index < 0 || index >= this.size) {
            return null;
        } else {
            // 保存旧元素
            Object old = this.array[index];
            // 把新元素放到index
            this.array[index] = o;
            return old;
        }
    }

    @Override
    public Object get(int index) {
        // 判断index是否合法
        if (index < 0 || index >= this.size) {
            return null;
        } else {
            return this.array[index];
        }
    }

    @Override
    public boolean isEmpty() {
        // 就是判断有效元素的个数是否为0
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void printElements() {
        // 从0到size-1依次输出
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + "\t");
        }
        System.out.println();
    }

}

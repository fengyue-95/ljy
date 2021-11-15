package com.ljy.designmode.Chain;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public abstract class Handler {

    public final static int father_type  = 1;
    public final static int husband_type = 2;
    public final static int son_type     = 3;

    private int              level        = 0;

    private Handler          next_handler;

    public Handler(int level){
        this.level = level;
    }

    public final void handMessage(IWoman iWoman) {
        if (iWoman.getType() == this.level) {
            this.Response(iWoman);
        } else {
            if (this.next_handler != null) {
                this.next_handler.Response(iWoman);
            } else {
                System.out.println("end...");
            }
        }
    }

    void setNext(Handler handler) {
        this.next_handler = handler;
    }

    abstract void Response(IWoman iWoman);

}

package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;

public abstract interface p
{
  public static final p qIS;
  
  static
  {
    GMTrace.i(5265898340352L, 39234);
    qIS = new p()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(5313545633792L, 39589);
        GMTrace.o(5313545633792L, 39589);
      }
      
      public final void aHH()
      {
        GMTrace.i(5313411416064L, 39588);
        GMTrace.o(5313411416064L, 39588);
      }
      
      public final void bup()
      {
        GMTrace.i(5313948286976L, 39592);
        GMTrace.o(5313948286976L, 39592);
      }
      
      public final void bur()
      {
        GMTrace.i(5313142980608L, 39586);
        GMTrace.o(5313142980608L, 39586);
      }
      
      public final void bus()
      {
        GMTrace.i(5312606109696L, 39582);
        GMTrace.o(5312606109696L, 39582);
      }
      
      public final void but()
      {
        GMTrace.i(5312874545152L, 39584);
        GMTrace.o(5312874545152L, 39584);
      }
      
      public final void buu()
      {
        GMTrace.i(5313679851520L, 39590);
        GMTrace.o(5313679851520L, 39590);
      }
      
      public final void buv()
      {
        GMTrace.i(5314216722432L, 39594);
        GMTrace.o(5314216722432L, 39594);
      }
      
      public final void onConnected()
      {
        GMTrace.i(5312740327424L, 39583);
        GMTrace.o(5312740327424L, 39583);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5313277198336L, 39587);
        GMTrace.o(5313277198336L, 39587);
      }
      
      public final void onReject()
      {
        GMTrace.i(5313008762880L, 39585);
        GMTrace.o(5313008762880L, 39585);
      }
      
      public final void wo(int paramAnonymousInt)
      {
        GMTrace.i(5314082504704L, 39593);
        GMTrace.o(5314082504704L, 39593);
      }
      
      public final void wp(int paramAnonymousInt)
      {
        GMTrace.i(5313814069248L, 39591);
        GMTrace.o(5313814069248L, 39591);
      }
    };
    GMTrace.o(5265898340352L, 39234);
  }
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt);
  
  public abstract void aHH();
  
  public abstract void bup();
  
  public abstract void bur();
  
  public abstract void bus();
  
  public abstract void but();
  
  public abstract void buu();
  
  public abstract void buv();
  
  public abstract void onConnected();
  
  public abstract void onError(int paramInt, String paramString);
  
  public abstract void onReject();
  
  public abstract void wo(int paramInt);
  
  public abstract void wp(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
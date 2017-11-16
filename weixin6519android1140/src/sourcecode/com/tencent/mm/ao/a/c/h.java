package com.tencent.mm.ao.a.c;

import java.util.concurrent.Executor;

public abstract interface h
  extends Executor
{
  public abstract boolean isPause();
  
  public abstract void pause();
  
  public abstract void remove(Object paramObject);
  
  public abstract void resume();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
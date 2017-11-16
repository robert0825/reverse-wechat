package com.tencent.wcdb;

public abstract interface CrossProcessCursor
  extends Cursor
{
  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);
  
  public abstract CursorWindow getWindow();
  
  public abstract boolean onMove(int paramInt1, int paramInt2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\CrossProcessCursor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
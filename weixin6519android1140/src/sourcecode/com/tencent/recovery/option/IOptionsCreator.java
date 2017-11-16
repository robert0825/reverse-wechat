package com.tencent.recovery.option;

import android.content.Context;

public abstract interface IOptionsCreator
{
  public abstract CommonOptions createCommonOptions(Context paramContext);
  
  public abstract ProcessOptions createProcessOptions(String paramString, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\option\IOptionsCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
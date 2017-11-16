package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class jo
  extends com.tencent.mm.bm.a
{
  public int bsx;
  public int oNd;
  public String tZv;
  public String text;
  public int type;
  public String url;
  
  public jo()
  {
    GMTrace.i(3697966841856L, 27552);
    GMTrace.o(3697966841856L, 27552);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3698101059584L, 27553);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      if (this.text != null) {
        paramVarArgs.e(2, this.text);
      }
      if (this.url != null) {
        paramVarArgs.e(3, this.url);
      }
      paramVarArgs.fk(4, this.oNd);
      paramVarArgs.fk(5, this.bsx);
      if (this.tZv != null) {
        paramVarArgs.e(6, this.tZv);
      }
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.type) + 0;
      paramInt = i;
      if (this.text != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.text);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.url);
      }
      i = i + b.a.a.a.fh(4, this.oNd) + b.a.a.a.fh(5, this.bsx);
      paramInt = i;
      if (this.tZv != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tZv);
      }
      GMTrace.o(3698101059584L, 27553);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      jo localjo = (jo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3698101059584L, 27553);
        return -1;
      case 1: 
        localjo.type = locala.yqV.nj();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 2: 
        localjo.text = locala.yqV.readString();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 3: 
        localjo.url = locala.yqV.readString();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 4: 
        localjo.oNd = locala.yqV.nj();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      case 5: 
        localjo.bsx = locala.yqV.nj();
        GMTrace.o(3698101059584L, 27553);
        return 0;
      }
      localjo.tZv = locala.yqV.readString();
      GMTrace.o(3698101059584L, 27553);
      return 0;
    }
    GMTrace.o(3698101059584L, 27553);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
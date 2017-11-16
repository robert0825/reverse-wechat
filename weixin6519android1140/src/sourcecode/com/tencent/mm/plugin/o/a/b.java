package com.tencent.mm.plugin.o.a;

import com.tencent.gmtrace.GMTrace;

public final class b
  extends com.tencent.mm.bm.a
{
  public String fjd;
  public int mhQ;
  public String mhR;
  public String mhS;
  public String mhT;
  public String mhU;
  public String mhV;
  public String mhW;
  public String mhX;
  public String mhY;
  public String mhZ;
  public String title;
  public String type;
  
  public b()
  {
    GMTrace.i(15031580229632L, 111994);
    GMTrace.o(15031580229632L, 111994);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15031714447360L, 111995);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.mhQ);
      if (this.type != null) {
        paramVarArgs.e(2, this.type);
      }
      if (this.title != null) {
        paramVarArgs.e(3, this.title);
      }
      if (this.mhR != null) {
        paramVarArgs.e(4, this.mhR);
      }
      if (this.mhS != null) {
        paramVarArgs.e(5, this.mhS);
      }
      if (this.mhT != null) {
        paramVarArgs.e(6, this.mhT);
      }
      if (this.mhU != null) {
        paramVarArgs.e(7, this.mhU);
      }
      if (this.mhV != null) {
        paramVarArgs.e(8, this.mhV);
      }
      if (this.mhW != null) {
        paramVarArgs.e(9, this.mhW);
      }
      if (this.mhX != null) {
        paramVarArgs.e(10, this.mhX);
      }
      if (this.fjd != null) {
        paramVarArgs.e(11, this.fjd);
      }
      if (this.mhY != null) {
        paramVarArgs.e(12, this.mhY);
      }
      if (this.mhZ != null) {
        paramVarArgs.e(13, this.mhZ);
      }
      GMTrace.o(15031714447360L, 111995);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.mhQ) + 0;
      paramInt = i;
      if (this.type != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.type);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.title);
      }
      paramInt = i;
      if (this.mhR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mhR);
      }
      i = paramInt;
      if (this.mhS != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.mhS);
      }
      paramInt = i;
      if (this.mhT != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.mhT);
      }
      i = paramInt;
      if (this.mhU != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.mhU);
      }
      paramInt = i;
      if (this.mhV != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.mhV);
      }
      i = paramInt;
      if (this.mhW != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.mhW);
      }
      paramInt = i;
      if (this.mhX != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.mhX);
      }
      i = paramInt;
      if (this.fjd != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.fjd);
      }
      paramInt = i;
      if (this.mhY != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mhY);
      }
      i = paramInt;
      if (this.mhZ != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.mhZ);
      }
      GMTrace.o(15031714447360L, 111995);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15031714447360L, 111995);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15031714447360L, 111995);
        return -1;
      case 1: 
        localb.mhQ = locala.yqV.nj();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 2: 
        localb.type = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 3: 
        localb.title = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 4: 
        localb.mhR = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 5: 
        localb.mhS = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 6: 
        localb.mhT = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 7: 
        localb.mhU = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 8: 
        localb.mhV = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 9: 
        localb.mhW = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 10: 
        localb.mhX = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 11: 
        localb.fjd = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      case 12: 
        localb.mhY = locala.yqV.readString();
        GMTrace.o(15031714447360L, 111995);
        return 0;
      }
      localb.mhZ = locala.yqV.readString();
      GMTrace.o(15031714447360L, 111995);
      return 0;
    }
    GMTrace.o(15031714447360L, 111995);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\o\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class pw
  extends com.tencent.mm.bm.a
{
  public String deviceBrand;
  public String deviceModel;
  public String osName;
  public String osVersion;
  public String ufT;
  
  public pw()
  {
    GMTrace.i(3791113945088L, 28246);
    GMTrace.o(3791113945088L, 28246);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3791248162816L, 28247);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.deviceModel != null) {
        paramVarArgs.e(1, this.deviceModel);
      }
      if (this.deviceBrand != null) {
        paramVarArgs.e(2, this.deviceBrand);
      }
      if (this.osName != null) {
        paramVarArgs.e(3, this.osName);
      }
      if (this.osVersion != null) {
        paramVarArgs.e(4, this.osVersion);
      }
      if (this.ufT != null) {
        paramVarArgs.e(5, this.ufT);
      }
      GMTrace.o(3791248162816L, 28247);
      return 0;
    }
    if (paramInt == 1) {
      if (this.deviceModel == null) {
        break label498;
      }
    }
    label498:
    for (int i = b.a.a.b.b.a.f(1, this.deviceModel) + 0;; i = 0)
    {
      paramInt = i;
      if (this.deviceBrand != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.deviceBrand);
      }
      i = paramInt;
      if (this.osName != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.osName);
      }
      paramInt = i;
      if (this.osVersion != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.osVersion);
      }
      i = paramInt;
      if (this.ufT != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ufT);
      }
      GMTrace.o(3791248162816L, 28247);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3791248162816L, 28247);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        pw localpw = (pw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3791248162816L, 28247);
          return -1;
        case 1: 
          localpw.deviceModel = locala.yqV.readString();
          GMTrace.o(3791248162816L, 28247);
          return 0;
        case 2: 
          localpw.deviceBrand = locala.yqV.readString();
          GMTrace.o(3791248162816L, 28247);
          return 0;
        case 3: 
          localpw.osName = locala.yqV.readString();
          GMTrace.o(3791248162816L, 28247);
          return 0;
        case 4: 
          localpw.osVersion = locala.yqV.readString();
          GMTrace.o(3791248162816L, 28247);
          return 0;
        }
        localpw.ufT = locala.yqV.readString();
        GMTrace.o(3791248162816L, 28247);
        return 0;
      }
      GMTrace.o(3791248162816L, 28247);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
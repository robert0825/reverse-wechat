package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class pu
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String nIw;
  public String title;
  public LinkedList<String> ufP;
  public String ufQ;
  public String url;
  
  public pu()
  {
    GMTrace.i(3719575896064L, 27713);
    this.ufP = new LinkedList();
    GMTrace.o(3719575896064L, 27713);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3719710113792L, 27714);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      paramVarArgs.d(4, 1, this.ufP);
      if (this.nIw != null) {
        paramVarArgs.e(5, this.nIw);
      }
      if (this.ufQ != null) {
        paramVarArgs.e(6, this.ufQ);
      }
      GMTrace.o(3719710113792L, 27714);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label562;
      }
    }
    label562:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.desc);
      }
      i += b.a.a.a.c(4, 1, this.ufP);
      paramInt = i;
      if (this.nIw != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nIw);
      }
      i = paramInt;
      if (this.ufQ != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.ufQ);
      }
      GMTrace.o(3719710113792L, 27714);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.ufP.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3719710113792L, 27714);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        pu localpu = (pu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3719710113792L, 27714);
          return -1;
        case 1: 
          localpu.title = locala.yqV.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 2: 
          localpu.url = locala.yqV.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 3: 
          localpu.desc = locala.yqV.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 4: 
          localpu.ufP.add(locala.yqV.readString());
          GMTrace.o(3719710113792L, 27714);
          return 0;
        case 5: 
          localpu.nIw = locala.yqV.readString();
          GMTrace.o(3719710113792L, 27714);
          return 0;
        }
        localpu.ufQ = locala.yqV.readString();
        GMTrace.o(3719710113792L, 27714);
        return 0;
      }
      GMTrace.o(3719710113792L, 27714);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
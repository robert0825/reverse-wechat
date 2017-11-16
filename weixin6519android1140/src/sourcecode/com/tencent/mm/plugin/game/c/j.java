package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class j
  extends com.tencent.mm.bm.a
{
  public int lPN;
  public String lPd;
  public String lPh;
  public String lPi;
  
  public j()
  {
    GMTrace.i(12636196438016L, 94147);
    GMTrace.o(12636196438016L, 94147);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12636330655744L, 94148);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.lPh == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      paramVarArgs.fk(1, this.lPN);
      if (this.lPi != null) {
        paramVarArgs.e(2, this.lPi);
      }
      if (this.lPh != null) {
        paramVarArgs.e(3, this.lPh);
      }
      if (this.lPd != null) {
        paramVarArgs.e(4, this.lPd);
      }
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lPN) + 0;
      paramInt = i;
      if (this.lPi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPi);
      }
      i = paramInt;
      if (this.lPh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPh);
      }
      paramInt = i;
      if (this.lPd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPd);
      }
      GMTrace.o(12636330655744L, 94148);
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
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.lPh == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      j localj = (j)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12636330655744L, 94148);
        return -1;
      case 1: 
        localj.lPN = locala.yqV.nj();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      case 2: 
        localj.lPi = locala.yqV.readString();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      case 3: 
        localj.lPh = locala.yqV.readString();
        GMTrace.o(12636330655744L, 94148);
        return 0;
      }
      localj.lPd = locala.yqV.readString();
      GMTrace.o(12636330655744L, 94148);
      return 0;
    }
    GMTrace.o(12636330655744L, 94148);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
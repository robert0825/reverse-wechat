package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bm.a
{
  public int nettype;
  public int tLe;
  public LinkedList<d> tLf;
  public String tLo;
  public String tLp;
  public String tLq;
  public String tLr;
  public String tLs;
  public int tLt;
  public int uin;
  
  public e()
  {
    GMTrace.i(13101931954176L, 97617);
    this.tLf = new LinkedList();
    GMTrace.o(13101931954176L, 97617);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13102066171904L, 97618);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uin);
      paramVarArgs.fk(2, this.tLe);
      paramVarArgs.fk(3, this.nettype);
      paramVarArgs.d(4, 8, this.tLf);
      if (this.tLo != null) {
        paramVarArgs.e(5, this.tLo);
      }
      if (this.tLp != null) {
        paramVarArgs.e(6, this.tLp);
      }
      if (this.tLq != null) {
        paramVarArgs.e(7, this.tLq);
      }
      if (this.tLr != null) {
        paramVarArgs.e(8, this.tLr);
      }
      if (this.tLs != null) {
        paramVarArgs.e(9, this.tLs);
      }
      paramVarArgs.fk(10, this.tLt);
      GMTrace.o(13102066171904L, 97618);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uin) + 0 + b.a.a.a.fh(2, this.tLe) + b.a.a.a.fh(3, this.nettype) + b.a.a.a.c(4, 8, this.tLf);
      paramInt = i;
      if (this.tLo != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tLo);
      }
      i = paramInt;
      if (this.tLp != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tLp);
      }
      paramInt = i;
      if (this.tLq != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tLq);
      }
      i = paramInt;
      if (this.tLr != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tLr);
      }
      paramInt = i;
      if (this.tLs != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tLs);
      }
      i = b.a.a.a.fh(10, this.tLt);
      GMTrace.o(13102066171904L, 97618);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13102066171904L, 97618);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13102066171904L, 97618);
        return -1;
      case 1: 
        locale.uin = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 2: 
        locale.tLe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 3: 
        locale.nettype = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locale.tLf.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 5: 
        locale.tLo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 6: 
        locale.tLp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 7: 
        locale.tLq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 8: 
        locale.tLr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      case 9: 
        locale.tLs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13102066171904L, 97618);
        return 0;
      }
      locale.tLt = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13102066171904L, 97618);
      return 0;
    }
    GMTrace.o(13102066171904L, 97618);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
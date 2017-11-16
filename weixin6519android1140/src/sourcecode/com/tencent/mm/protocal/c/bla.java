package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bla
  extends ayx
{
  public int eMw;
  public int scene;
  public int tWR;
  public int uVl;
  public int uVm;
  public int uVn;
  public String uVo;
  public String username;
  
  public bla()
  {
    GMTrace.i(3853793624064L, 28713);
    GMTrace.o(3853793624064L, 28713);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3853927841792L, 28714);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.scene);
      paramVarArgs.fk(3, this.uVl);
      paramVarArgs.fk(4, this.tWR);
      paramVarArgs.fk(5, this.uVm);
      paramVarArgs.fk(6, this.uVn);
      if (this.username != null) {
        paramVarArgs.e(7, this.username);
      }
      paramVarArgs.fk(8, this.eMw);
      if (this.uVo != null) {
        paramVarArgs.e(9, this.uVo);
      }
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.scene) + b.a.a.a.fh(3, this.uVl) + b.a.a.a.fh(4, this.tWR) + b.a.a.a.fh(5, this.uVm) + b.a.a.a.fh(6, this.uVn);
      paramInt = i;
      if (this.username != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.username);
      }
      i = paramInt + b.a.a.a.fh(8, this.eMw);
      paramInt = i;
      if (this.uVo != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uVo);
      }
      GMTrace.o(3853927841792L, 28714);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bla localbla = (bla)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3853927841792L, 28714);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbla.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 2: 
        localbla.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 3: 
        localbla.uVl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 4: 
        localbla.tWR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 5: 
        localbla.uVm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 6: 
        localbla.uVn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 7: 
        localbla.username = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      case 8: 
        localbla.eMw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3853927841792L, 28714);
        return 0;
      }
      localbla.uVo = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3853927841792L, 28714);
      return 0;
    }
    GMTrace.o(3853927841792L, 28714);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
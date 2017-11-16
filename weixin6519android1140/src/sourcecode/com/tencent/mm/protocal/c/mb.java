package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class mb
  extends ayx
{
  public String ucK;
  public String ucL;
  public String ucM;
  public String ucN;
  public String ucO;
  public long ucP;
  public String ucQ;
  public String ucR;
  
  public mb()
  {
    GMTrace.i(3773531422720L, 28115);
    GMTrace.o(3773531422720L, 28115);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3773665640448L, 28116);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ucK != null) {
        paramVarArgs.e(2, this.ucK);
      }
      if (this.ucL != null) {
        paramVarArgs.e(3, this.ucL);
      }
      if (this.ucM != null) {
        paramVarArgs.e(4, this.ucM);
      }
      if (this.ucN != null) {
        paramVarArgs.e(5, this.ucN);
      }
      if (this.ucO != null) {
        paramVarArgs.e(6, this.ucO);
      }
      paramVarArgs.T(7, this.ucP);
      if (this.ucQ != null) {
        paramVarArgs.e(8, this.ucQ);
      }
      if (this.ucR != null) {
        paramVarArgs.e(9, this.ucR);
      }
      GMTrace.o(3773665640448L, 28116);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.ucK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ucK);
      }
      i = paramInt;
      if (this.ucL != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ucL);
      }
      paramInt = i;
      if (this.ucM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ucM);
      }
      i = paramInt;
      if (this.ucN != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ucN);
      }
      paramInt = i;
      if (this.ucO != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ucO);
      }
      i = paramInt + b.a.a.a.S(7, this.ucP);
      paramInt = i;
      if (this.ucQ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.ucQ);
      }
      i = paramInt;
      if (this.ucR != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.ucR);
      }
      GMTrace.o(3773665640448L, 28116);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3773665640448L, 28116);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      mb localmb = (mb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3773665640448L, 28116);
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
          localmb.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 2: 
        localmb.ucK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 3: 
        localmb.ucL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 4: 
        localmb.ucM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 5: 
        localmb.ucN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 6: 
        localmb.ucO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 7: 
        localmb.ucP = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      case 8: 
        localmb.ucQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3773665640448L, 28116);
        return 0;
      }
      localmb.ucR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3773665640448L, 28116);
      return 0;
    }
    GMTrace.o(3773665640448L, 28116);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
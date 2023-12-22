import React from 'react'

const ChatComponent = ({ sets }) => {
    return (
        <>
            <h1>ㅎㅇ!!</h1>
            <div>
                {sets.chatList.map((chat) => {
                    return (
                        <>
                            <p>{chat.nickname}</p>
                            <h3>{chat.msg}</h3>
                        </>
                    )
                })}
            </div>
            <input type="text" value={sets.msg} onChange={(e)=>{
                sets.setMsg(e.target.value)
            }}/>
        </>

    )
}

export default ChatComponent
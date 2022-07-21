package com.xiancommon.utils.concurrent;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class EventQueue {
    private final int max;
    static class Event {

    }
    private final LinkedList<Event> events = new LinkedList<Event>();
    private final static int DEFAULT_MAX_EVENT = 10;
    public EventQueue() {
        this(DEFAULT_MAX_EVENT);
    }
    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event) {
        synchronized (events) {
            if (events.size() >= max) {
                try {
                    console("the queue is full.");
                    events.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            console("the new event is submitted.");
            events.addLast(event);
            events.notify();
        }
    }

    public Event take() throws InterruptedException {
        synchronized (events) {
            if (events.isEmpty()) {
                console("the queue is empty.");
                events.wait();
            }
            Event event = events.removeFirst();
            this.events.notify();
            console("the event " + event + " is handled.");
            return event;
        }
    }

    private static void console(String message) {
        System.out.printf("%s:%S\n",Thread.currentThread().getName(),message);
    }
}
